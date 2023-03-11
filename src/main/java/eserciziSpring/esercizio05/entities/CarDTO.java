package eserciziSpring.esercizio05.entities;

import jakarta.validation.constraints.NotNull;
import lombok.ToString;

@ToString
public class CarDTO {
    @NotNull (message = "mandatory")
    private String id;
    @NotNull(message = "mandatory")
    private String modelName;
    private Double price;

    public CarDTO(String id, String modelName, Double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }
    public CarDTO(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
