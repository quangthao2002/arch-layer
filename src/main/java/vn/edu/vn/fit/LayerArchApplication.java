package vn.edu.vn.fit;

import net.datafaker.Faker;
import net.datafaker.providers.food.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.vn.fit.models.Student;
import vn.edu.vn.fit.repositorys.StudentRepository;
import vn.edu.vn.fit.untils.StudentStatus;

@SpringBootApplication
public class LayerArchApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(LayerArchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        Coffee fk = faker.coffee();

        for (int i = 0; i < 10; i++) {
            Student st = new Student(fk.blendName(),fk.descriptor(), fk.name1());
            studentRepository.save(st);
        }
    }
}
