	import java.util.*;
//if Ƕ��ѡ��ṹ������
public class RunTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("����������ܲ��ɼ���");
		double time = input.nextDouble();
		System.out.print("����������Ա�");
		String sex = input.next();
		if(time<10){
			if(sex.equals("��")){
				System.out.println("����������������");
			}else if(sex.equals("Ů")){
				System.out.println("�������Ů�������");
			}else{
				System.out.println("�Բ������������������������");
			}
		}	else{
				System.out.println("�Բ��� ����ĳɼ����ϸ�");
		}
	}
}