package com.behl.pilotrun.config;//package com.behl.pilotrun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;//

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

//
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.task.SimpleAsyncTaskExecutor;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.jdbc.datasource.init.DataSourceInitializer;
//import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//
//import javax.sql.DataSource;
//
//@Configuration
public class SimpleAsyncExecutor extends RecursiveTask<Integer> {
//
//    //https://tenusha.medium.com/running-multiple-tasks-in-parallel-with-completablefuture-and-custom-thread-pools-in-spring-boot-dc4bf0ee7d98#:~:text=It%20creates%20an%20ThreadPoolTaskExecutor%20instance,prefix%20to%20%E2%80%9CproductTaskExecutor-%E2%80%9D.
//
//    @Bean(name = "asyncExecutor")
//    public SimpleAsyncTaskExecutor asyncExecutor() {
//        return new SimpleAsyncTaskExecutor();
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        HikariDataSource dataSource = new HikariDataSource();
//        dataSource.setDriverClassName("your.driver.class.name");
//        dataSource.setJdbcUrl("your.jdbc.url");
//        dataSource.setUsername("your.username");
//        dataSource.setPassword("your.password");
//        return dataSource;
//    }
//
//    @Bean
//    public DataSourceInitializer dataSourceInitializer(DataSource dataSource) {
//        DataSourceInitializer initializer = new DataSourceInitializer();
//        initializer.setDataSource(dataSource());
//        initializer.setDatabasePopulator(databasePopulator());
//        return initializer;
//    }
//
//    private ResourceDatabasePopulator databasePopulator() {
//        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//        populator.addScript(new ClassPathResource("data.sql")); // Replace with your data script name
//        return populator;
//    }
//
    @Bean(name = "asyncExecutor")
    public ThreadPoolTaskExecutor asyncExecutors() {

        ExecutorService es = Executors.newSingleThreadExecutor();

//Internally manages thread pool of 2 threads
        ExecutorService ess = Executors.newFixedThreadPool(2);

//Internally manages thread pool of 10 threads to run scheduled tasks
        ExecutorService esee = Executors.newScheduledThreadPool(10);

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(20);
        executor.setThreadNamePrefix("Async-");
        executor.initialize();
        return executor;
    }

    @Bean
    public ForkJoinPool forkJoinPool() {
        return new ForkJoinPool(10); // Adjust pool size as needed
    }

    @Override
    protected Integer compute() {
        return null;
    }
}
