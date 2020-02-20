package az.company.homeworks.homework6;
import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother,Human father, Human[]children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother,Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(){

    }


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child){
        if(children!=null){
           Human[] ushaq=new Human[children.length+1];
            for (int i=0;i<children.length;i++){
                ushaq[i]=children[i];
            }
            ushaq[children.length]=child;
            children=ushaq;
        }
        else {
          Human[]ushaq=new Human[1];
            ushaq[0]=child;
            children=ushaq;
        }
    }
    public void deleteChild (int i) {
        if (children != null) {
                 Human[] ushaq = new Human[children.length-1];
            for (int j = 0; j < children.length; j++) {
                if (j < i) {
                    ushaq[j] = children[j];
                } else if (j > i) {
                    ushaq[j - 1] = children[j];
                }
            }
            children = ushaq;
        }
    }
    public int countFamily(){
        return 2+children.length;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof az.company.homeworks.homework5.Family)) return false;
        az.company.homeworks.homework5.Family family = (az.company.homeworks.homework5.Family) o;
        return Objects.equals(mother, family.getMother()) &&
                Objects.equals(father, family.getFather()) &&
                Arrays.equals(children, family.getChildren()) &&
                Objects.equals(pet, family.getPet());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet= "+pet+
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized in Family class: " + this);
    }
}

