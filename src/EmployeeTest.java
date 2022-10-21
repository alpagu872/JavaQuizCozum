public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("Nesne oluşturmadan önce çalışan sayısı: "+Employee.getCount());
        System.out.println("İlk nesne oluştuktan sonra: ");
        Employee e1 = new Employee("Ahmet", 10000,true);
        System.out.println("Çalışan bilgileri: Adı: " + e1.getName() + ",Maaşı: "+ e1.getSalary() + ", Durumu: " + e1.getActive()+ " Nesne sayısı: " +Employee.getCount());
        System.out.println("İkinci nesne oluştuktan sonra: ");
        Employee e2 = new Employee("Gözde",7000, false);
        System.out.println("Çalışan bilgileri: Adı: " + e2.getName() + ",Maaşı: "+ e2.getSalary() + ", Durumu: " + e2.getActive()+ " Nesne sayısı: " +Employee.getCount());
        System.out.println("Toplam çalışan sayısı: " + Employee.getCount());

    }
}
