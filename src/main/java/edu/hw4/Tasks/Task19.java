package edu.hw4.Tasks;

import edu.hw4.Animal;
import edu.hw4.ValidationError.ValidationError;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

public final class Task19 {
    private Task19() {
    }

    public static Map<String, Set<ValidationError>> animalsWithErrors(@NotNull List<Animal> animals) {
        return animals.stream()
            .filter(animal -> !ValidationError.setOfValidationErrors(animal).isEmpty())
            .collect(Collectors.toMap(Animal::name, ValidationError::setOfValidationErrors));
    }
}
