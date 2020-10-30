package event;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MyItem implements ItemListener{
	public void itemStateChanged(ItemEvent e){
		System.out.println("아이템 선택 바꿨어?");
	}
}
