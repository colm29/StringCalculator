public class StringCalculator {

    int Add(String numbers) {
        if (numbers == "")
            return 0;

        var numberArray = numbers.split(",");
        if (numberArray.length > 2)
            throw new IllegalArgumentException();

        int total = 0;

        for (String s : numberArray)
            total = total + Integer.parseInt(s);

        return total;
    }

}
