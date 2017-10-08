package score;

public class score {

	public void ToGradeScore(int scores)
	{
		if(scores>=90&&scores<100){System.out.println(scores+"  优");return;}
		if(scores>=80&&scores<=89){System.out.println(scores+"  良");return;}
		if(scores>=70&&scores<=79){System.out.println(scores+"  中");return;}
		if(scores>=60&&scores<=69){System.out.println(scores+"  及格");return;}
		if(scores>=0&&scores<=50){System.out.println(scores+"  不及格");return;}
		else {System.out.println(scores+"  erro!!");}
	}
	
	public static void main(String[] args) {
		score l=new score();
		int [] a={66,64,73,89,88,99,333};
		String[] a1=new String[a.length];
		for(int i=0;i<a.length;i++)
		{
			l.ToGradeScore(a[i]);
		}
		
	}

}