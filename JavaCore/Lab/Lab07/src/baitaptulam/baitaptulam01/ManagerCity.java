package baitaptulam.baitaptulam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCity {
    public static void main(String[] args) {
        int choice = 0;
        boolean run = true;

        ArrayList<City> cities = new ArrayList<City>();

        while (run) {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Nhập thông tin n thành phố\n2. Hiển thị thông tin vừa nhập\n3. Sắp xếp thông tin tăng dần theo tên nước\n4. Tìm kiếm thông tin theo cityId\n5. Thoát");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    int n = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < n; i++) {
                        String cityId = input.nextLine();
                        String cityName = input.nextLine();
                        String country = input.nextLine();
                        Double area = input.nextDouble();
                        input.nextLine();
                        City city = new City(cityId, cityName, country, area);
                        cities.add(city);
                    }
                    break;
                case 2:
                    if (!cities.isEmpty()) {
                        for (City city : cities) {
                            city.hienthi();
                        }
                    } else System.out.println("Chưa có thành phố nào");
                    break;
                case 3:
                    if (!cities.isEmpty()) {
                        for (int i = 0; i < cities.size() - 1; i++) {
                            for (int j = i + 1; j < cities.size() - i - 1; j++) {
                                if (cities.get(j).getCityName().compareTo(cities.get(j + 1).getCityName()) > 0) {
                                    City city = cities.get(j);
                                    cities.set(j, cities.get(j + 1));
                                    cities.set(j + 1, city);
                                }
                            }
                        }

                        for (City city : cities) {
                            city.hienthi();
                        }
                    } else System.out.println("Chưa có thành phố nào");
                    break;
                case 4:
                    if (!cities.isEmpty()) {
                        String cityId = input.nextLine();
                        for (City city : cities) {
                            if (city.getCityId().compareTo(cityId) == 0) {
                                city.hienthi();
                            }
                        }
                    } else System.out.println("Chưa có thành phố nào");
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
    }
}
