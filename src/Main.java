public class Main {
    public static void main(String[] args) {
        //1
        {
            int age=18;
            if(age>=18){
                System.out.println("поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет");
            }else{
                System.out.println("информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать");
            }
        }
        //2
        {
            int age=7;
            if(age>=7){
                System.out.println("ходит в школу");
            }else if(age>=18){
                System.out.println("ходит в вуз");
            }else if(age>=24){
                System.out.println("ходит на работу");
            }
        }
        //3
        {
            int people=120;
            int place=102;
            int placeSit=60;
            if(people>=place){
                System.out.println("мест нет");
            }else if(people>=placeSit){
                System.out.println("есть только стоячие места");
            }else{
                System.out.println("есть сидячие места");
            }

        }
    }
}