import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by ivanovsv on 10/07/2015.
 */
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("INITIAL SALARY")
    private double amount;

    @SerializedName("TAX AMOUNT")
    private double tax;

    @SerializedName("GROSS SALARY")
    private double amountAfterTax;

    public Salary(double amount, double tax, double amountAfterTax) {
        this.amount = amount;
        this.tax = tax;
        this.amountAfterTax = amountAfterTax;
    }
}
