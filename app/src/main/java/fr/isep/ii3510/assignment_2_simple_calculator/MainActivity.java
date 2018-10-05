package fr.isep.ii3510.assignment_2_simple_calculator;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends Activity implements View.OnClickListener{
    Button zero_Btn,one_Btn,two_Btn,three_Btn,four_Btn,five_Btn,six_Btn,seven_Btn,eight_Btn,nine_Btn;
    Button point_Btn,clear_Btn,plusorminus_Btn,percent_Btn,devision_Btn,multiple_Btn,minus_Btn,plus_Btn,equal_Btn;
    Button show_detail_Btn;
    TextView screen_editView,result_textView,count;

    int count_equal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero_Btn = (Button)findViewById(R.id.zero_Btn);
        one_Btn = (Button)findViewById(R.id.one_Btn);
        two_Btn = (Button)findViewById(R.id.two_Btn);
        three_Btn = (Button)findViewById(R.id.three_Btn);
        four_Btn = (Button)findViewById(R.id.four_Btn);
        five_Btn = (Button)findViewById(R.id.five_Btn);
        six_Btn = (Button)findViewById(R.id.six_Btn);
        seven_Btn = (Button)findViewById(R.id.seven_Btn);
        eight_Btn = (Button)findViewById(R.id.eight_Btn);
        nine_Btn = (Button)findViewById(R.id.nine_Btn);
        point_Btn = (Button)findViewById(R.id.point_Btn);
        clear_Btn = (Button)findViewById(R.id.clear_Btn);
        plusorminus_Btn = (Button)findViewById(R.id.plusorminus_Btn);
        percent_Btn = (Button)findViewById(R.id.percent_Btn);
        devision_Btn = (Button)findViewById(R.id.devision_Btn);
        multiple_Btn = (Button)findViewById(R.id.multiple_Btn);
        minus_Btn = (Button) findViewById(R.id.minus_Btn);
        plus_Btn =(Button)findViewById(R.id.plus_Btn);
        equal_Btn = (Button)findViewById(R.id.equal_Btn);
        show_detail_Btn = (Button) findViewById(R.id.show_detail_Btn);
        screen_editView = (TextView) findViewById(R.id.screen_editView);
        result_textView = (TextView)findViewById(R.id.result_textView);
        count = (TextView)findViewById(R.id.count);

        zero_Btn.setOnClickListener(this);
        one_Btn.setOnClickListener(this);
        two_Btn.setOnClickListener(this);
        three_Btn.setOnClickListener(this);
        four_Btn.setOnClickListener(this);
        five_Btn.setOnClickListener(this);
        six_Btn.setOnClickListener(this);
        seven_Btn.setOnClickListener(this);
        eight_Btn.setOnClickListener(this);
        nine_Btn.setOnClickListener(this);
        point_Btn.setOnClickListener(this);
        clear_Btn.setOnClickListener(this);
        plusorminus_Btn.setOnClickListener(this);
        percent_Btn.setOnClickListener(this);
        devision_Btn.setOnClickListener(this);
        multiple_Btn.setOnClickListener(this);
        minus_Btn.setOnClickListener(this);
        plus_Btn.setOnClickListener(this);
        equal_Btn.setOnClickListener(this);
        show_detail_Btn.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        String str = screen_editView.getText().toString();
        switch (v.getId()){
            case R.id.zero_Btn:
                multiple_zero();
                screen_editView.setText(str+((Button)v).getText());
                set_zero();
                display_result();
                clear_function();
                break;
            case R.id.one_Btn:
                screen_editView.setText(str+((Button)v).getText());
                set_zero();
                display_result();
                clear_function();
                break;
            case R.id.two_Btn:
                screen_editView.setText(str+((Button)v).getText());
                set_zero();
                display_result();
                clear_function();
                break;
            case R.id.three_Btn:
                screen_editView.setText(str+((Button)v).getText());
                set_zero();
                display_result();
                clear_function();
                break;
            case R.id.four_Btn:
                screen_editView.setText(str+((Button)v).getText());
                set_zero();
                display_result();
                clear_function();
                break;
            case R.id.five_Btn:
                screen_editView.setText(str+((Button)v).getText());
                set_zero();
                display_result();
                clear_function();
                break;
            case R.id.six_Btn:
                screen_editView.setText(str+((Button)v).getText());
                set_zero();
                display_result();
                clear_function();
                break;
            case R.id.seven_Btn:
                screen_editView.setText(str+((Button)v).getText());
                set_zero();
                display_result();
                clear_function();
                break;
            case R.id.eight_Btn:
                screen_editView.setText(str+((Button)v).getText());
                set_zero();
                display_result();
                clear_function();
                break;
            case R.id.nine_Btn:
                screen_editView.setText(str+((Button)v).getText());
                set_zero();
                display_result();
                clear_function();
                break;
            case R.id.point_Btn:
                clear_function();
                point_control();
                break;
            case R.id.plus_Btn:
                clear_function();
                screen_editView.setText(str+" "+((Button)v).getText()+" ");
                detect_first_operation();
                detect_second_operation();
                display_result();
                break;
            case R.id.minus_Btn:
                clear_function();
                screen_editView.setText(str+" "+((Button)v).getText()+" ");
                detect_first_operation();
                detect_second_operation();
                display_result();
                break;
            case R.id.devision_Btn:
                clear_function();
                screen_editView.setText(str+" "+((Button)v).getText()+" ");
                detect_first_operation();
                detect_second_operation();
                display_result();
                break;
            case R.id.multiple_Btn:
                clear_function();
                screen_editView.setText(str+" "+((Button)v).getText()+" ");
                detect_first_operation();
                detect_second_operation();
                display_result();
                break;
            case R.id.clear_Btn:
                clear_btn_control();
                count_equal = 0;
                count.setText(String.valueOf(count_equal));
                break;
            case R.id.equal_Btn:
                clear_function();
                set_repeat_calculate();
                count_equal();
                divide_by_0();
                break;
            case R.id.percent_Btn:
                clear_function();
                judge_calculate_percentage();
                screen_editView.setText(result_textView.getText().toString());
                break;
            case R.id.plusorminus_Btn:
                clear_function();
                plus_minus();
                break;
            case R.id.show_detail_Btn:
                show_detail();
        }
    }

    private void calculate_Result(String input,String second_operation){
        //input = screen_editView.getText().toString();
        //clear_Btn = true;
        double result = 0;
        if(!input.contains(" ")){
            return;
        }

        String before = input.substring(0,input.indexOf(" "));
        String after = input.substring(input.indexOf(" ")+3,input.length());
        String operation = input.substring(input.indexOf(" ")+1,input.indexOf(" ")+2);
        double d_before = Double.parseDouble(before);
        double d_after = Double.parseDouble(after);
        //BigDecimal b_before = new BigDecimal(before);
        //BigDecimal b_after = new BigDecimal(after);
        //double b_final;

        if(second_operation!= null){
            if(operation.equals("+")){
                result = d_before+d_after;
                result_textView.setText(String.valueOf(result));
                screen_editView.setText(String.valueOf(result)+second_operation);
            }
            else if(operation.equals("-")){
                result = d_before-d_after;
                result_textView.setText(String.valueOf(result));
                screen_editView.setText(String.valueOf(result)+second_operation);
            }
            else if(operation.equals("*")){
                //b_final = b_before.multiply(b_after).doubleValue();
                result_textView.setText(String.valueOf(result));
                result = d_before*d_after;
                screen_editView.setText(String.valueOf(result)+second_operation);
            }
            else if(operation.equals("÷")){
                if(d_after==0){
                    result = 0;
                    result_textView.setText(String.valueOf(result));
                    screen_editView.setText(String.valueOf(result)+second_operation);
                }
                else{
                    //result = d_before/d_after;
                    //b_final = b_before.divide(b_after).doubleValue();
                    if(input.substring(input.indexOf(".")).length()>5){
                        /*DecimalFormat format = new DecimalFormat("#.000");
                        String result_format = format.format(result);*/
                        //result_textView.setText(String.valueOf(resslt_format));
                        if(String.valueOf(result).substring(0,1)== "."){
                            screen_editView.setText("0"+ String.valueOf(result)+second_operation);
                        }
                        else{
                            screen_editView.setText(String.valueOf(result)+second_operation);
                        }

                        //result_textView.setText(input.substring(input.indexOf(".")));
                    }
                    else {
                        if(String.valueOf(result).substring(0,1)== "."){
                            screen_editView.setText("0"+ String.valueOf(result)+second_operation);
                        }
                        else{
                            screen_editView.setText(String.valueOf(result)+second_operation);
                        }
                    }

                }
            }
        }
        else if(second_operation == null){
            if(operation.equals("+")){
                result = d_before+d_after;
                result_textView.setText(String.valueOf(result));
                screen_editView.setText(String.valueOf(result));
            }
            else if(operation.equals("-")){
                result = d_before-d_after;
                result_textView.setText(String.valueOf(result));
                screen_editView.setText(String.valueOf(result));
            }
            else if(operation.equals("*")){
                result = d_before*d_after;
                result_textView.setText(String.valueOf(result));
                screen_editView.setText(String.valueOf(result));
            }
            else if(operation.equals("÷")){
                if(d_after==0){
                    result = 0;
                    result_textView.setText(String.valueOf(result));
                    screen_editView.setText(String.valueOf(result));
                }
                else{
                    result = d_before/d_after;
                    DecimalFormat format = new DecimalFormat("#.000000");
                    String result_format = format.format(result);
                    //result_textView.setText(String.valueOf(resslt_format));
                    //screen_editView.setText(String.valueOf(resslt_format));
                    if(String.valueOf(result_format).substring(0,1).contains(".")){
                        screen_editView.setText("0" + String.valueOf(result_format));
                        result_textView.setText("0"+ String.valueOf(result_format));
                    }
                    else{
                        screen_editView.setText(String.valueOf(result_format));
                        result_textView.setText(String.valueOf(result_format));
                    }
                }
            }
        }
    }

    // -----------------------------------------------  repeat calculate  ------------------------------------------- //

    public String get_operation(){
        String input = screen_editView.getText().toString();
        String operation = input.substring(input.indexOf(" "));
        return operation;
    }

    public void set_repeat_calculate(){
        String input = screen_editView.getText().toString();
        String operation = get_operation();
        calculate_Result(input,null);
        String on_the_screenn = screen_editView.getText().toString();
        screen_editView.setText(on_the_screenn+ operation);
    }

    private void count_equal(){
        count_equal = count_equal + 1;
        count.setText(String.valueOf(count_equal));
    }

    //------------------------------------------------  percentage point  -------------------------------------------- //
    private void point_control(){
        String input = screen_editView.getText().toString();
        if(!input.contains(" ")){
            if(input == ""){
                Toast.makeText(getApplicationContext(),"wrong input",Toast.LENGTH_SHORT).show();
                return;
            }
            else if(input.contains(".")){
                Toast.makeText(getApplicationContext(),"wrong input",Toast.LENGTH_SHORT).show();
                return;
            }
            else {
                screen_editView.setText(input+".");
                result_textView.setText(input.substring(input.lastIndexOf(" ")+1)+".");
            }
        }
        else if(input.substring(input.lastIndexOf(" ")) == " "){
            Toast.makeText(getApplicationContext(),"wrong input",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(input.substring(input.lastIndexOf(" ")+1).contains(".")){
            Toast.makeText(getApplicationContext(),"wrong input",Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            screen_editView.setText(input+".");
            result_textView.setText(input.substring(input.lastIndexOf(" ")+1)+".");
        }
    }


//----------------------------------------------------  plus or minus  ----------------------------------------------------- //

    private void plus_minus(){
        String input = screen_editView.getText().toString();
        if(!input.contains(" ")){
            double d_input = Double.parseDouble(input);
            double d_output = d_input * (-1);
            result_textView.setText(String.valueOf(d_output));
            screen_editView.setText(String.valueOf(d_output));
        }
        else if(input.contains("+")||input.contains("-")||input.contains("*")||input.contains("÷")){
            if(input.substring(input.lastIndexOf(" ")).length()== 1){
                return;
            }
            else {
                calculate_Result(input,null);
                calculate_plus_minus();
            }
        }
    }

    private void calculate_plus_minus(){
        String input = result_textView.getText().toString();
        double d_input = Double.parseDouble(input);
        double d_output = d_input * (-1);
        result_textView.setText(String.valueOf(d_output));
        screen_editView.setText(String.valueOf(d_output));
    }


//--------------------------------------------------------  clear function  --------------------------------------------------
    private void clear_function(){
        if(screen_editView.getText().toString().length() != 0){
            set_C();
        }
        else if(screen_editView.getText().toString().length() == 0){
            set_AC();
        }
    }

    private void clear_btn_control(){
        if (clear_Btn.getText().toString()=="C"){
            String input = screen_editView.getText().toString();
            result_textView.setText("");
            if(input.contains("+")||input.contains("-")||input.contains("*")||input.contains("÷")){
                screen_editView.setText(input.substring(0,input.lastIndexOf(" ")+1));
            }
            else {
                screen_editView.setText("");
            }
            set_AC();
        }
        else if(clear_Btn.getText().toString() == "AC"){
            screen_editView.setText("");
        }
    }

    private void set_C(){
        clear_Btn.setText("C");
    }

    private void set_AC(){
        clear_Btn.setText("AC");
    }


//---------------------------------------------------------  calculate percentage  ---------------------------------------------------
    private void judge_calculate_percentage(){
        String input = screen_editView.getText().toString();
        if(input.contains("+")||input.contains("-")||input.contains("*")||input.contains("÷")){
            if(input.substring(input.indexOf(" ")).length()==3){
                return;
            }
            else if(input.substring(input.indexOf(" ")).length()>3){
                calculate_Result(input,null);
                calculate_percentage();
            }
        }
        else {
            //result_textView.setText(screen_editView.getText().toString()+".0");
            calculate_percentage();
        }
    }

    private void calculate_percentage(){

        /*------------------------------------method 1-------------------------------------*/
        /*                    using double calculate percentage directly                   */

        String need_to_move = screen_editView.getText().toString();
        double d_need_to_move = Double.parseDouble(need_to_move);
        double d_after_move_point = d_need_to_move * 0.01;
        result_textView.setText(String.valueOf(d_after_move_point));

        /*     -------------------------------method 2-------------------------------------*/
        /*                        using string to move percent point                       */

        /*int before_point_position,after_point_position;
        String before_point, after_point, after_move;

        before_point_position = need_to_move.indexOf(".");

        if(need_to_move.substring(0,need_to_move.indexOf(".")).length()>=3){
            after_point_position = before_point_position - 2;
            before_point = need_to_move.substring(0,after_point_position);
            after_point = need_to_move.substring(after_point_position,need_to_move.length()-2);
            after_move = before_point + "." + after_point;
            result_textView.setText(after_move);
        }
        else if(need_to_move.substring(0,need_to_move.indexOf(".")).length() == 2){
            //after_point_position = before_point_position - 1;
            after_point = need_to_move.substring(0,before_point_position);
            after_move = "0." + after_point;
            result_textView.setText(after_move);
        }
        else if(need_to_move.substring(0,need_to_move.indexOf(".")).length() == 1){
            after_point = need_to_move.substring(0,before_point_position);
            after_move = "0.0" + after_point;
            result_textView.setText(after_move);
        }
        else if(need_to_move.substring(0,1)== "0."){
            before_point = need_to_move.substring(0,need_to_move.indexOf(".")+1);
            after_point = need_to_move.substring(need_to_move.indexOf(".")+1);
            after_move = before_point + "00" + after_point;
            result_textView.setText("666666");
        }
        */

    }


    //-------------------------------------------------  detect first / second operation  ----------------------------------------//

    private void detect_first_operation(){
        String on_the_screen = screen_editView.getText().toString();
        if(!on_the_screen.substring(0,on_the_screen.length()-3).contains("+")
                ||!on_the_screen.substring(0,on_the_screen.length()-3).contains("-")
                ||!on_the_screen.substring(0,on_the_screen.length()-3).contains("*")
                ||!on_the_screen.substring(0,on_the_screen.length()-3).contains("÷")){
            //this is the first operation
            if(count_equal>1){
                screen_editView.setText(on_the_screen.substring(0,on_the_screen.indexOf(" "))+on_the_screen.substring(on_the_screen.length()-3));
                count_equal = 0;
                screen_editView.setText(String.valueOf(count_equal));
            }
            else if(on_the_screen.substring(on_the_screen.length()-4).contains("  ")){
                screen_editView.setText(on_the_screen.substring(0,on_the_screen.length()-6) + on_the_screen.substring(on_the_screen.length()-3) );
            }
            else {
                return;
            }
        }
        else {
            return;
        }
    }

    private void detect_second_operation(){
        String on_the_screen = screen_editView.getText().toString();
            String input,second_operation;
            if(on_the_screen.substring(0,on_the_screen.length()-3).contains("+")
                    ||on_the_screen.substring(0,on_the_screen.length()-3).contains("-")
                    ||on_the_screen.substring(0,on_the_screen.length()-3).contains("*")
                    ||on_the_screen.substring(0,on_the_screen.length()-3).contains("÷")){
                //this is the second operation
                    input = on_the_screen.substring(0,on_the_screen.length()-3);
                    second_operation = on_the_screen.substring(on_the_screen.length()-3);
                    calculate_Result(input,second_operation);
            }
        else {
            return;
        }
        }


    //-------------------------------------------------------  display result  ----------------------------------------//

    private void display_result(){
        String screen_text = screen_editView.getText().toString();
        String number;
        if(!screen_text.contains(" ")){
            result_textView.setText(screen_text);
        }
        else if(!screen_text.substring(0,screen_text.length()-3).contains(" ")){
            number = screen_text.substring(0,screen_text.indexOf(" "));
            result_textView.setText(number);
        }
        else if(screen_text.substring(0,screen_text.length()-2).contains("  ")){
            result_textView.setText(screen_text.substring(0,screen_text.indexOf(" ")));
        }
        else if(screen_text.contains(" + ")||screen_text.contains(" - ")||screen_text.contains(" * ")||screen_text.contains(" ÷ ")){
            if(screen_text.substring(screen_text.lastIndexOf(" "))==" "){
                result_textView.setText(screen_text.substring(0,screen_text.indexOf(" ")));
            }
            else {
                String show = screen_text.substring(screen_text.lastIndexOf(" ")+1);
                result_textView.setText(show);
            }

        }
        else{
            return;
        }
    }

    //-------------------------------------------------------  divide by 0  ---------------------------------------------//

    private void divide_by_0(){
        String input = screen_editView.getText().toString();
        String detect_object = input.substring(input.lastIndexOf(" ")+1);
        double num = Double.parseDouble(detect_object);
        if(num == 0){
            Toast.makeText(getApplicationContext(),"cannot divide 0",Toast.LENGTH_SHORT).show();
            screen_editView.setText("");
            result_textView.setText("");
            return;
        }
        else {
            return;
        }
    }

    //----------------------------------------------------- show detail  --------------------------------------------------//

    boolean show_hide = false;
    public void show_detail(){
        if(show_detail_Btn.getText()=="show detail"){
            screen_editView.setTextColor(Color.rgb(23,32,42));
            show_detail_Btn.setText("hide detail");

        }
        else if(show_hide == false){
            screen_editView.setTextColor(Color.rgb(255,255,255));
            show_detail_Btn.setText("show detail");


        }
    }

    //------------------------------------------------------  set  zero  ------------------------------------------------------//

    private void set_zero(){
        String input = screen_editView.getText().toString();
        if(count_equal>=1){
            screen_editView.setText(input.substring(input.length()-1));
            count_equal = 0;
        }
        else {
            return;
        }
    }

    //------------------------------------------------------  multiple zero  -----------------------------------------------------//

    private void multiple_zero(){
        String input = screen_editView.getText().toString();
        if(!input.contains(" ")){
            if(input==""){
                return;
            }
            else if(input.substring(0,1)=="0"){
                if(input.substring(1,2)=="0"){
                    Toast.makeText(getApplicationContext(),"wrong input",Toast.LENGTH_SHORT).show();
                    screen_editView.setText("0");
                    return;
                }
                else {
                    return;
                }
            }

        }
        else if(input.substring(input.lastIndexOf(" ")+1,input.lastIndexOf(" ")+2)=="0"){
            if(input.substring(input.lastIndexOf(" ")+2,input.lastIndexOf(" ")+3)=="0"){
                Toast.makeText(getApplicationContext(),"wrong input",Toast.LENGTH_SHORT).show();
                String cut = input.substring(0,input.lastIndexOf(" ")+2);
                screen_editView.setText(cut);
            }
        }
    }


    }










