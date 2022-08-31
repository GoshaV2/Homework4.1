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

        //4.3
        //1
        {
            int age=24;
            if(2<=age && age<=6){
                System.out.println("детский сад");
            }else if(7<=age && age<=18){
                System.out.println("школа");
            }else if(18<age && age<24){
                System.out.println("универ");
            }else if(24<age){
                System.out.println("работа");
            }
        }
        //2
        {
            int age=123;
            if(age<5){
                System.out.println("не может");
            }else if(5<age && age<14){
                System.out.println("в сопровождение взрослого");
            }else if(14<age){
                System.out.println("можно");
            }
        }
        //3
        {
            int one=9;
            int two=5;
            int free=3;
            int temp;
            if(two<one){
                temp=one;
                one=two;
                two=temp;
            }
            if(free<two){
                temp=two;
                two=free;
                free=temp;
            }
            if(two<one){
                temp=one;
                one=two;
                two=temp;
            }
            System.out.println(one+" "+two+" "+free);
            System.out.println("Наибольшее: "+free);
        }
    }
}