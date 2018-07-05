package com.ddesk.stock;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.ddesk.stock.util.LookAndFeelUtils;
import com.ddesk.stock.view.TestVIew;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		LookAndFeelUtils.setWindowsLookAndFeel();
		final ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).headless(false).run(args);
		context.getBean(TestVIew.class);

		/*
		 * final MainMenuController mainMenuController =
		 * context.getBean(MainMenuController.class);
		 * mainMenuController.prepareAndOpenFrame();
		 */
	}

}
