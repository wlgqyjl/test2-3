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
	if(empty==true){System.out.println("填充巧克力和牛奶！");empty=false;}
}
public void boil()
{
	if(empty==false&&boiled==false){System.out.println("将炉内煮沸！");boiled=true;}
}
public void drain()
{
	if(empty==false&&boiled==true){System.out.println("排出煮沸的巧克力和牛奶！");empty=true;}
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
