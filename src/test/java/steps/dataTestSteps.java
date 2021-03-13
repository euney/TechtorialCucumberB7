package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class dataTestSteps {

    @Given("the user print product titles")
    public void the_user_print_product_titles(DataTable dataTable) {
        List<String>productInfo=dataTable.asList();
        for (String info: productInfo){
            System.out.println(info);
        }

    }



    @Then("the user print credentials")
    public void the_user_print_credentials(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> credentials=dataTable.asMap(String.class, String.class);

        Set<String> keys=credentials.keySet();

        for (String key: keys){
            System.out.println("Key:" +key+ "Value" + credentials.get(key));

        }




    }
    @Then("the user print product info")
    public void the_user_print_product_info(List<List<String>>products) {
     //Print out values from data table
        //the output will look like data table

      //   | MyMoney     | 4        | Techtorial  | 2200 E Devon | Chicago     |
      //   | FamilyAlbum | 2        | Academy     | 2200 E Devon | Austin      |

    for (List<String>row : products){
        for (String detail : row){
            System.out.println("|" +detail);
        }

        System.out.println();

    }


    }

    @Then("the user print product details")
    public void the_user_print_product_details(DataTable dataTable) {

        List<Map<String, String >> details= dataTable.asMaps();

         for (Map<String ,String> detail: details){
             for (String key : detail.keySet()){
                 System.out.println("Key" + "Value" +detail.get(key));
             }

             System.out.println("=========================");

         }



    }





}
