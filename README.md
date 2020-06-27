# Joquempô
![GitHub language count](https://img.shields.io/github/languages/count/diegobpaula/joquempo) ![GitHub top language](https://img.shields.io/github/languages/top/diegobpaula/joquempo)	![GitHub last commit](https://img.shields.io/github/last-commit/diegobpaula/joquempo)	![GitHub repo size](https://img.shields.io/github/repo-size/diegobpaula/joquempo)

The application was developed in the Java language, the purpose of the application is a simple and recreational hand game where you play against the robot.

## Screenshots

![](https://github.com/diegobpaula/joquempo/blob/master/app/src/main/res/drawable/printOne.jpg?raw=true)

## Code selection random choice
```java
public void selectedOption(int selectedOptionUser) {

        ImageView viewResult = findViewById(R.id.imageResult);
        TextView textResult = findViewById(R.id.textResult);
        ImageView imageResult = findViewById(R.id.imageRes);

        int valueSelect = new Random().nextInt(3);
        int[] option = {0, 1, 2};
        int optionRobot = option[valueSelect];

        switch (optionRobot) {

            case 0:
                viewResult.setImageResource(R.drawable.stone);
                break;

            case 1:
                viewResult.setImageResource(R.drawable.paper);
                break;

            case 2:
                viewResult.setImageResource(R.drawable.scissors);
                break;

        }
}

```
## Development steps
- Android Studio 4.0

## I, Diego
- [Linkedln](http://https://www.linkedin.com/in/diegobpaula/ "Linkedln")
- Email: diego.paula@live.com
