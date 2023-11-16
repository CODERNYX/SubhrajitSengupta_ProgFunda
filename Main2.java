class Super{
    String department = "Super Department";
    String todayswork = "No work as of now";
    String getWorkDeadline = "Nil";
    String holiday = "Today is not a holiday";
    String departmentName(){
        return department;
    }
    String getTodaysWork(){
        return todayswork;
    }
    String getWorksDeadline(){
        return getWorkDeadline;
    }
    String isTodayAHoliday(){
        return holiday;
    }
}
class Admin extends Super{
    String departmentName(){
        return "Admin Department";
    }
    String getTodaysWork(){
        return "Complete your documents Submission";
    }
    String getWorksDeadline(){
        return "Complete by EOD";
    }
    String isTodayAHoliday(){
        return super.isTodayAHoliday();
    }
}
class HR extends Super{
    String departmentName(){
        return "HR Department";
    }
    String getTodaysWork(){
        return "Fill today's timesheet and mark your attendance";
    }
    String getWorksDeadline(){
        return "Complete by EOD";
    }
    String doActivity(){
        return "team lunch";
    }
    String isTodayAHoliday(){
        return super.isTodayAHoliday();
    }
}
class Tech extends Super{
    String departmentName(){
        return "Tech Department";
    }
    String getTodaysWork(){
        return "Complete coding of module 1";
    }
    String getWorksDeadline(){
        return "Complete by EOD";
    }
    String getTeachStackInformation(){
        return "core Java";
    }
    String isTodayAHoliday(){
        return super.isTodayAHoliday();
    }
}
public class Main2{
    public static void main(String[] args) {
        Admin a = new Admin();
        HR hr = new HR();
        Tech t = new Tech();
        System.out.println("Welcome to " + a.departmentName());
        System.out.println(a.getTodaysWork());
        System.out.println(a.getWorksDeadline());
        System.out.println(a.isTodayAHoliday());
        System.out.println();
        System.out.println("Welcome to " + hr.departmentName());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorksDeadline());
        System.out.println(hr.doActivity());
        System.out.println(a.isTodayAHoliday());  
        System.out.println();
        System.out.println("Welcome to " + t.departmentName());
        System.out.println(t.getTodaysWork());
        System.out.println(t.getWorksDeadline());
        System.out.println(t.getTeachStackInformation());
        System.out.println(a.isTodayAHoliday());      
    }
}