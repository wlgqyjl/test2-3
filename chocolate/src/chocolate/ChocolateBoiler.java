package chocolate;

public class ChocolateBoiler {
private boolean empty;
private boolean boiled;
private static class ChocolateBoiler1
{
	private static final ChocolateBoiler INSTANCE=new ChocolateBoiler();
}
private ChocolateBoiler()
{
	empty=true;
	boiled=false;
}
public static final ChocolateBoiler getlnstance(){
	return ChocolateBoiler1.INSTANCE;
}
public void fill()
{
	if(empty==true){System.out.println("����ɿ�����ţ�̣�");empty=false;}
}
public void boil()
{
	if(empty==false&&boiled==false){System.out.println("��¯����У�");boiled=true;}
}
public void drain()
{
	if(empty==false&&boiled==true){System.out.println("�ų���е��ɿ�����ţ�̣�");empty=true;}
}
public static void main(String[] args)
{
	ChocolateBoiler l;
	l=ChocolateBoiler.getlnstance();
	l.fill();
	l.boil();
	l.drain();

}
}
