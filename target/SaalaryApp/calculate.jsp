<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Calculate</title>
    </head>
    <body>
        <h2>Net to Gross</h2>
        <form action="servlet" method="POST">

            <label for="year">Year: </label>
            <input type="text" name="year" id = "year">
            <br>

            <label for="gross">Gross Salary: </label>
            <input type="text" name="gross" id = "gross">
            <br>

            <label for="private">Private sector </label>
            <input type="radio" name="sector" id="private"  value = "private">
            <br>
            <label for="state">State Sector </label>
            <input type="radio" name="sector" id="state" value = "state">
            <br>

            <label for="discount">Discount </label>
            <input type="checkbox" name="discount" id="myCheck" onclick="myFunction()">
            <br>

            <div id="checkBox" style="display:none">

                <label for="discount1">Discount1 </label>
                <input type="radio" name="discounts" id="discount1" value="400">
                <br>
                <label for="discount2">Discount2 </label>
                <input type="radio" name="discounts" id="discount2" value="200">
                <br>
                <label for="discount3">Discount3 </label>
                <input type="radio" name="discounts" id="discount3" value="100">
                <br>
                <label for="discount4">Discount4 </label>
                <input type="radio" name="discounts" id="discount4" value="50">
                <br>
            </div>
            <label> Partnership Membership: </label>
            <label for="percentage"> % of Gross Salary </label>
            <input type="number" id="percentage" name="quantity" min="1" max="100">
            <br>
             <input type="submit" value="Submit">
        </form>
    </body>
</html>
