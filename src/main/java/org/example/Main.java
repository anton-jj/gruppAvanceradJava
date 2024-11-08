package org.example;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        UserService userService = new UserService();
        List<User> users = new ArrayList<>();

        users.add(new User(User.UserRole.ADMIN, true, "email@email.com", "user1", 1));
        users.add(new User(User.UserRole.USER, false, "email@email.com", "user2", 2));
        users.add(new User(User.UserRole.ADMIN, true, "email@email.com", "user3", 3));
        users.add(new User(User.UserRole.USER, false, "email@email.com", "user4", 4));
        users.add(new User(User.UserRole.ADMIN, false, "email@email.com", "user5", 5));

        List<UserDTO> newList = userService.getActiveAdminUsers(users);
        for (UserDTO u : newList) {
            System.out.println(u.getUsername());
        }

        //övning 2
        MyArrayList<Integer> myarr = new MyArrayList();
        MyArrayList<String> stringMyArrayList = new MyArrayList<>();
        stringMyArrayList.add("hello");
        stringMyArrayList.add("world");
        stringMyArrayList.remove(2);
       for (int i = 0; i < stringMyArrayList.size(); i++){
           System.out.println(stringMyArrayList.get(i));
       }
        myarr.add(3);
        myarr.add(6);
        myarr.add(12);
        myarr.add(24);
        myarr.add(30);
        myarr.add(36);
        myarr.add(42);
        myarr.remove(4);

        System.out.println("------------");
        for (int i = 0; i < myarr.size(); i++) {
            System.out.println(myarr.get(i));
        }
        System.out.println("------------");



        //övning 3
        try {
            Class<?> clazz = Class.forName("org.example.Calculator");

            Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
            constructor.setAccessible(true);

            Object calc = constructor.newInstance(3);

            Method addNumber = clazz.getDeclaredMethod("add", int.class);
            addNumber.setAccessible(true);

            int result = (int) addNumber.invoke(calc, 1);

            System.out.println("Resultat av add-metod: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Övning 4
        AutoCallTest act = new AutoCallTest();
        printAutoCall(act);
    }

    public static <T> void printAutoCall(T value) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = value.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(AutoCall.class)) {
                method.setAccessible(true);
                method.invoke(value);
            }
        }
    }
}
