package pixel.academy.setter_injection_app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FrenchChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return " Prepare boeuf ";
    }
}
