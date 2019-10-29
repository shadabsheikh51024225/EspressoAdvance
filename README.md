# EspressoAdvance



AdapterView is a special kind of view specifically designed to render a collection of similar information 
like product list and user contacts fetched from an underlying data source using Adapter. The data source may be
simple list to complex database entries. Some of the view derived from AdapterView are ListView, GridView and Spinner.


AdapterView renders the user interface dynamically depending on the amount of data available in the underlying data source. 
In addition, AdapterView renders only the minimum necessary data, which can be rendered in the available visible area of the 
screen. AdapterView does this to conserve memory and to make the user interface look smooth even if the underlying data is
large.




onData(allOf(is(instanceOf(String.class)), startsWith("Apple"))).perform(click())

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
