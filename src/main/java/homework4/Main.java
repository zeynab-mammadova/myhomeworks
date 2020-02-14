package homework4;
public class Main {
    public static void main(String[] args) {
        Human mother=new Human("Elnara","Mammadova",1983);
        Human father = new Human("Mubariz","Mammadov",1969);
        String[] habits={"playing","eating","spleeping"};
        Pet pug=new Pet("dog","pug",4,60,habits);
        pug.eat();
        pug.respond();
        pug.foul();
        System.out.println(pug);
        String[][] schedule={{"Monday","go to the IBA"},{"Tueday","do homeworks"},{"Wednesday","go to the museum"},{"Thursday","go to the IBA"},{"Friday","go to the university"},{"Saturday","go to the IBA"},{"Sunday","go to the breakfast"}};
        Human me=new Human("Jack","Bing",2001,70,mother,father,pug,schedule);
        System.out.println(me);
        me.describePet();
        Pet golden=new Pet("dog","golden",3,77,habits);
        me.feedPet(false);//for advanced part
    }
}
