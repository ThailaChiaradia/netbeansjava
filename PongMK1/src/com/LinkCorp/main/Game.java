package com.LinkCorp.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import com.LinkCorp.entities.Ball;
import com.LinkCorp.entities.Enemy;
import com.LinkCorp.entities.Player;
import com.LinkCorp.entities.Player2;
import com.LinkCorp.graphics.MapsImage;
import com.LinkCorp.graphics.MenuImage;
import com.LinkCorp.menus.GameOver;
import com.LinkCorp.menus.Jogar;
import com.LinkCorp.menus.Menu;
import com.LinkCorp.menus.Rank;
import com.LinkCorp.menus.Tutorial;


public class Game extends Canvas implements Runnable, KeyListener{

	private static final long serialVersionUID = 1L;
	
	private Thread thread;
	private boolean isRunning = true;
	//escalas da janela
	public static final int WIDTH = 410;
	public static final int HEIGHT = 220;
	public static final int SCALE = 2;
	
	//estanciando imagens
	public static MenuImage menuImage;
	public static MapsImage mapsImage;
	
	//estanciando os objetos
	public Menu menu;
	
	public Tutorial tutorial;
	
	public Jogar jogar;
	
	public GameOver gameOver;
	
	public Rank rank;
	
	public Maps maps;
	
	public static Points points;
	
	public static Save save;
	
	public static Save2 save2;
	
	//entidades
	public static Player player;
	
	public static Player2 player2;
	
	public static Enemy enemy;
	
	public static Ball ball;
	
	//define em que estado o jogo se encontra
	public static String gameState = "MENU";

	public BufferedImage layer = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);	
	
	//função construtra
	public Game(){
		
		this.addKeyListener(this);
		this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		initFrame();
		
		menuImage = new MenuImage("/Titulo.png");
		mapsImage = new MapsImage("/Maps.png");
		
		player = new Player(10, (HEIGHT/2) - 30);
		player2 = new Player2(WIDTH- 10 - 13, (HEIGHT/2) - 30);
		enemy = new Enemy(WIDTH- 10 - 13, (HEIGHT/2) - 30);
		ball = new Ball((WIDTH/2)-2,(HEIGHT/2)-2);
		
		points = new Points();		
		menu = new Menu();
		tutorial = new Tutorial();
		jogar = new Jogar();
		maps = new Maps();
		gameOver = new GameOver();
		rank = new Rank();
		
		save = new Save();
		save2 = new Save2();
	}
	
	public void initFrame(){
		JFrame frame = new JFrame("Pong");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	//inicializa o sistema
	public synchronized void start(){
		thread = new Thread(this);
		isRunning = true;
		thread.start();
	}
	
	//encerra o programa
	public  synchronized void stop(){
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//inciando
		public static void main(String[] args) {
			Game game = new Game();
			game.start();
			
		}
	
	//gera a parte funcional
	public void tick() {
		
		maps.tick();
		points.tick();
		
		if(gameState == "NORMAL") {
			player.tick();
			enemy.tick();
			ball.tick();
			
			gameOver.exState = 'N';
		
			if(Game.points.ePoint >=3) {
				gameState = "GAMEOVER";
			}
		}
		
		if(gameState == "FOREVER") {
			player.tick();
			enemy.tick();
			ball.tick();
			
			if(Game.points.ePoint >=1) {
				gameState = "GAMEOVER";
			}
			
			gameOver.exState = 'F';
			
		}
		
		if(gameState == "PvP") {
			
			player.tick();
			player2.tick();
			ball.tick();
			
			if(Game.points.pPoint >= 5 || Game.points.p2Point >=5) {
				gameState = "GAMEOVER";
			}

			gameOver.exState = 'P';
			
		}
		
		if(gameState == "GAMEOVER") {
			 gameOver.tick();
		}
		
		if(gameState == "MENU") {
			
			//zera as variaveis de pontuação
			points.ePoint = 0;
			points.giveBack = 0;
			points.pPoint = 0;
			points.p2Point = 0;
			
			gameOver.save = true;
			
			//inicia o menu
			menu.tick();
		}
		if(gameState == "JOGAR") {
			jogar.tick();
		}
		if(gameState == "TUTORIAL") {
			tutorial.tick();
		}
		if(gameState == "RANK") {
			rank.tick();
		}
	}
	
	
	//renderiza os gráficos
	public void render() {
		
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = layer.getGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		maps.render(g);
		points.render(g);
		
		if(gameState == "NORMAL") {
			//rederiza o jogador, o inimigo e a bola
			
			player.render(g);
			enemy.render(g);
			ball.render(g);
		}
		if(gameState == "PvP") {
			
			player.render(g);
			player2.render(g);
			ball.render(g);
		}
		if(gameState == "FOREVER") {
			player.render(g);
			enemy.render(g);
			ball.render(g);
		}
		
		if(gameState == "GAMEOVER") {
			gameOver.render(g);
		}
		
		if(gameState == "MENU") {
			//renderiza o menu
			menu.render(g);
		}
		
		if(gameState == "JOGAR") {
			jogar.render(g);
		}
		if(gameState == "TUTORIAL") {
			tutorial.render(g);
		}
		if(gameState == "RANK") {
			rank.render(g);
		}
		
		
		g = bs.getDrawGraphics();
		g.drawImage(layer,0,0,WIDTH*SCALE,HEIGHT*SCALE,null);
		
		bs.show();
	}
	
	//O programa todo roda dentro deste looping
	public void run() {
		long lastTime = System.nanoTime();
		double amountsOfTicks = 60.0;
		double ns = 1000000000 / amountsOfTicks;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();		
		requestFocus();
		
		while(isRunning) {
			long now = System.nanoTime();
			delta+= (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1) {
				tick(); //atualiza
				render(); //renderiza
				frames++;
				delta--;
			}
			if(System.currentTimeMillis() - timer >= 1000) {
				System.out.println(" FPS: " + frames);
				frames = 0;
				timer += 1000;
			}
		}
		
		stop();
	}

//-----------------------------------------------------------------
	
	//Lendo funções do teclado
	
	@Override
	public void keyTyped(KeyEvent e) {

	}
	
	//detecta quando a tecla for precionada
	@Override
	public void keyPressed(KeyEvent e) {
		
		//W e UP
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W){
			
			if(gameState == "NORMAL" || gameState == "FOREVER") {
				player.up = true;
			}
			
			if(gameState == "MENU") {
				menu.up = true;
			}
			if(gameState == "JOGAR") {
				jogar.up = true;
			}
			if(gameState == "GAMEOVER") {
				gameOver.up = true;
			}
		}
		
		//S e DOWN
		if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S){
			if(gameState == "NORMAL" || gameState == "FOREVER") {
				player.down = true;
			}
			if(gameState == "MENU") {
				menu.down = true;
			}
			if(gameState == "JOGAR") {
				jogar.down = true;
			}
			if(gameState == "GAMEOVER") {
				gameOver.down = true;
			}
		}
		
		
		//para o modo PvP devemos diferenciar as duas teclas
		if(e.getKeyCode() == KeyEvent.VK_UP){	
			if(gameState == "PvP") 
				player2.up = true;
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			if(gameState == "PvP") 
				player2.down = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_W){	
			if(gameState == "PvP")
				player.up = true;
			
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			
			if(gameState == "PvP") 
				player.down = true;
		}
			
		
		//ENTER
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(gameState == "MENU") {
				Menu.select = true;
			}
			if(gameState == "JOGAR") {
				Jogar.select = true;
			}
			if(gameState == "GAMEOVER") {
				GameOver.select = true;
			}
			if(gameState == "TUTORIAL") {
				Tutorial.select = true;
			}
			if(gameState == "RANK") {
				Rank.select = true;
			}
		}
	}
	
	
	//detecta quando a tecla for solta
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){	
			if(gameState == "NORMAL" || gameState == "FOREVER") {
				player.up = false;
			}
			if(gameState == "PvP") {
				player2.up = false;
			}
			if(gameState == "MENU") {
				menu.up = false;
			}
			if(gameState == "JOGAR") {
				jogar.up = false;
			}
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			if(gameState == "NORMAL" || gameState == "FOREVER") {
				player.down = false;
			}
			if(gameState == "PvP") {
				player2.down = false;
			}
			if(gameState == "MENU") {
				menu.down = false;
			}
			if(gameState == "JOGAR") {
				jogar.down = false;
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_W){	
			if(gameState == "NORMAL" || gameState == "FOREVER") {
				player.up = false;
			}
			if(gameState == "PvP") {
				player.up = false;
			}
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			if(gameState == "NORMAL" || gameState == "FOREVER") {
				player.down = false;
			}
			if(gameState == "PvP") {
				player.down = false;
			}
		}
	}
}