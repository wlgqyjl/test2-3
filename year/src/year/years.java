package year;

public class years {
	public boolean judge(int Year)
	{
		if(Year%4==0&&Year%100!=0)
			return true;
		if(Year%400==0)
			return true;
		else
			return false;
	}
	public static void main(String args[]){
		years l=new years();
		int j=0;
		for(int i=1990;i<=2007;i++)
		{
			if(l.judge(i)){System.out.println(i);j++;}
			
			if(j==2){System.out.println(" ");j=0;}
		}
		
	}

}
