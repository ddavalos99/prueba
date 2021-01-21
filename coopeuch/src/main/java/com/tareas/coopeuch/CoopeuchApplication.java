package com.tareas.coopeuch;
import com.tareas.coopeuch.dao.TareaDao;
import com.tareas.coopeuch.model.Tarea;
import com.tareas.coopeuch.model.TareaDto;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
@EnableSwagger2
public class CoopeuchApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoopeuchApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(TareaDao tareaDao){
    	Date fecha1 = new Date();
    	Date fecha2 = new Date();
    	/*Llenado Datos de Ejemplo para Base*/
        return args -> {
            Tarea tarea1 = new Tarea();
            tarea1.setDescripcion("Tarea1");
            tarea1.setFechaCreacion(fecha1);
            tarea1.setVigente(true);
            tareaDao.save(tarea1);

            Tarea tarea2 = new Tarea();
            tarea2.setDescripcion("Tarea2");
            tarea2.setFechaCreacion(fecha2);
            tarea2.setVigente(true);
            tareaDao.save(tarea2);
        };
    }

}
