package top.birdguo.algorithm.rabbitborn;

public class RabbitBorn {

	/**
	 * ������������������
	 * 
	 * @param month �·�
	 * @return
	 */
	public static int rabbitSolution(int month){
		
		if(month>2){
			return rabbitSolution(month-1)+rabbitSolution(month-2);
		}else{
			return 1;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(rabbitSolution(6));
		
	}

}
