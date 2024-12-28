package models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class School{
    private ArrayList<Person> members;

    public School(){
        this.members = new ArrayList<>();
    }

    public void addMember(Person person){
        members.add(person);
    }

    @Override
    public String toString() {
        // Sort members by surname
        members.sort(Comparator.comparing(Person::getSurname));
        StringBuilder sb = new StringBuilder("School Members:\n");
        for (Person member : members) {
            sb.append(member).append("\n");
        }
        return sb.toString();
    }

}
