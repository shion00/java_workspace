/*
 * 주인공을 정의한다!!
 * */
package day1103.game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

public class Hero extends GameObject{
	GamePanel gamePanel; //enemyList가 있는 클래스라서..
	
	public Hero(GamePanel gamePanel, Image img, int x, int y, int width, int height, int velX, int velY) {
		super(img, x,y,width,height,velX,velY);
		this.gamePanel =gamePanel;
	}
	
	//물리량 변화(데이터의 변화)
	public void tick() {
		this.x +=this.velX;
		this.y += this.velY;
		
		rect.x=x;
		rect.y=y;
		
		if(gamePanel.hpList.size() >=1) { //에너지가 1개이상일 경우만..
			collisionCheck();
		}else {
			System.out.println("게임 종료, 에너지 모두 소진");
			gamePanel.over=true;
			gamePanel.flag=false;
		}
		
	}
	
	public void  collisionCheck() {
		//적군과 나의 충돌여부를 판단하고, 만일 충돌하면 나의 HP죽고 너죽고 ,
		for(int i=0;i<gamePanel.enemyList.size();i++) {
			Enemy enemy = gamePanel.enemyList.get(i);
			
			if(this.rect.intersects(enemy.rect)) { //충돌..
				gamePanel.hpList.remove(gamePanel.hpList.size()-1);//나  hp죽이고
				gamePanel.enemyList.remove(enemy);//너죽고
				break;
			}
		}
		
	}
	
	
	//그래픽 처리 (화면 그려질 처리)
	//모든 게임 케릭터는 패널에 그려야 하므로,  g2를 패널의  paint() 메서드
	//의 지역변수를 받아오자!!
	public void render(Graphics2D g2) {
		//g2.setColor(Color.RED);
		g2.drawRect(rect.x, rect.y, rect.width, rect.height);
		
		//우리가 이미 보유하고 있는 사각형을 시각화 시켜보자!!		
		g2.drawImage(img, rect.x, rect.y, null);
	}
	
}









