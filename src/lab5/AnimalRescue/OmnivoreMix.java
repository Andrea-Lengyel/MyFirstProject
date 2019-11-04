package lab5.AnimalRescue;

public class OmnivoreMix extends Food {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void meatType() {
        System.out.println("Meal worm");
    }

    public void specificIngredient() {
        System.out.println("Dried vegetable mix");
    }

    public void vitContent() {
        System.out.println("Vitamin A & C");
    }
}
