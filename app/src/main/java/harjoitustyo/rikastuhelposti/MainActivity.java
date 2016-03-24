package harjoitustyo.rikastuhelposti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "harjoitustyo.rikastuhelposti.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** HAE-nappia painettaessa */
    public void hae(View view) {
        Intent intent = new Intent(this, NaytaTulos.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();

        /*// Yksi osake
        Stock stock = null;
        try {
            stock = YahooFinance.get(message);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        BigDecimal price = stock.getQuote().getPrice();*/

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
