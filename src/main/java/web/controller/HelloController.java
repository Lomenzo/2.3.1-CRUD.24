package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.model.User;
import web.service.CarService;
import web.service.CarServiceImp;
import web.service.UserService;
import web.service.UserServiceImp;
import web.util.Colors;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@Autowired
	UserService userService;

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
//		User user1 = new User("Vasya",35,"Ivanov");
//		userService.add(user1);
//		System.out.println(user1);
		return "index";
	}

	@GetMapping(value = "/users")
	public String printUsers(ModelMap model) {
		List<User> users = new ArrayList<>();
		User user1 = new User("Vasya",35,"Ivanov");
		User user2 = new User("Petya",23,"Petrov");
		userService.add(user2);
		System.out.println(user2);
		users.add(user1);
		users.add(user2);
		model.addAttribute("users", users);
		return "users";
	}


//	@RequestMapping(value = "/cars", method = RequestMethod.GET)
//	public String getBarBySimplePathWithRequestParam(@RequestParam(value = "count", required = false) Integer count, ModelMap cars) {
//		List<Car> carList = new ArrayList<>();
//		carList.add(new Car("Honda", 883, Colors.red));
//		carList.add(new Car("Mercedes", 600, Colors.grey));
//		carList.add(new Car("Hyundai", 300, Colors.black));
//		carList.add(new Car("KIA", 625, Colors.white));
//		carList.add(new Car("Toyota", 100, Colors.blue));
//		CarService carService = new CarServiceImp(carList);
//		if (count != null) {
//			cars.addAttribute("cars", carService.getCarList(count));
//		} else {
//			cars.addAttribute("cars", carList);
//		}
//		return "car";
//	}

//	@RequestMapping(value = "/cars/count={carValue}")
//	public String printCars(@PathVariable int carValue, ModelMap cars) {
//		List<Car> carList = new ArrayList<>();
//		carList.add(new Car("Honda", 883, Colors.red));
//		carList.add(new Car("Mercedes", 600, Colors.grey));
//		carList.add(new Car("Hyundai", 370, Colors.black));
//		carList.add(new Car("KIA", 625, Colors.white));
//		carList.add(new Car("Toyota", 100, Colors.blue));
//		CarService carService = new CarServiceImp(carList);
//		cars.addAttribute("cars", carService.getCarList(carValue));
//		return "car";
//	}

//1. Создайте еще один контроллер, замаппленный на /сагс.
//2. Создайте модель Саг с тремя произвольными полями.
//3. Создайте список из 5 машин.
//4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//5. Создайте страницу car.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//6. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//при cars?count=3 - из 3, итд. При cars >= 5 выводить весь список машин.
}