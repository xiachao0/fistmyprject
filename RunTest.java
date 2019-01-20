	import java.util.*;
//if 嵌套选择结构的例题
public class RunTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的跑步成绩：");
		double time = input.nextDouble();
		System.out.print("请输入你的性别：");
		String sex = input.next();
		if(time<10){
			if(sex.equals("男")){
				System.out.println("你进入了男子组决赛");
			}else if(sex.equals("女")){
				System.out.println("你进入了女子组决赛");
			}else{
				System.out.println("对不起你的输入有误清重新输入");
			}
		}	else{
				System.out.println("对不起 ，你的成绩不合格");
		}
	}
}