package ArrayLitses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex_girlfriend_List {
    List<Ex_girlfriend> ex_girlfriendList;

    public Ex_girlfriend_List(){
        ex_girlfriendList = new ArrayList<>();
    }

    public void PrintExGirlfriend(){
        for (int i = 0 ; i< ex_girlfriendList.size(); i++ ){
            System.out.println((i+1) + "." + this.ex_girlfriendList.get(i).getName() + " => " + this.ex_girlfriendList.get(i).getAge() +
            this.ex_girlfriendList.get(i).getAddress() + " => " + this.ex_girlfriendList.get(i).getPhoneNumber());
        }
    }

    public void AddEx_girlfriend (Ex_girlfriend ex_girlfriend){
        ex_girlfriendList.add(ex_girlfriend);
    }


    public boolean DeleteExGirlfriend (String name)
    {
        Ex_girlfriend EX = this.ex_girlfriendList.stream().filter(ex_girlfriend -> ex_girlfriend.getName().
                equals(name)).findFirst().orElse(null);
        if (EX == null) {
            return false;
        }
        this.ex_girlfriendList.remove(EX);
        return true;
    }

    public void SearchExGirlfriend(String name){
        boolean search = false;
        for (Ex_girlfriend s : ex_girlfriendList){
            if (s.getName().contains(name)){
                search  = true;
                System.out.println(s.toString());
                break;
            }
        }
        if (!search){
            System.out.println("Can't see my ExGirlfriend ");
        }
    }

    public void SortNameExGirlfriend(){
        Collections.sort(ex_girlfriendList, Comparator.comparing(Ex_girlfriend :: getName));
        for (int i = 0; i < ex_girlfriendList.size(); i++){
            System.out.println((i+1) + " . " + this.ex_girlfriendList.get(i).getName() + "=>" + this.ex_girlfriendList.get(i).getAge()+ " => "
                    + this.ex_girlfriendList.get(i).getAddress() + " => "+this.ex_girlfriendList.get(i).getPhoneNumber());
        }

    }

    public void SortAgeExGirlfriend(){
        Collections.sort(ex_girlfriendList, Comparator.comparing(Ex_girlfriend ::getAge));
        ex_girlfriendList.forEach(Girlfriend ->{
            System.out.println(this.ex_girlfriendList.toString());
        });
    }

}
