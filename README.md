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

Normally, testing a WebView needs to be a challenge because it uses HTML technology for its user interface elements rather than native user interface/views. Espresso excels in this area by providing a new set to web matchers and web assertions, which is intentionally similar to native view matchers and view assertions. At the same time, it provides a wellbalanced approach by including a web technology based testing environment as well.

Espresso web is built upon WebDriver Atom framework, which is used to find and manipulate web elements. Atom is similar to view actions. Atom will do all the interaction inside a web page. WebDriver exposes a predefined set of methods, like findElement(), getElement() to find web elements and returns the corresponding atoms (to do action in the web page).

A standard web testing statement looks like the below code,

onWebView()
   .withElement(Atom)
   .perform(Atom)
   .check(WebAssertion)
Here,

onWebView() − Similar to onView(), it exposes a set of API to test a WebView.

withElement() − One of the several methods used to locate web elements inside a web page using Atom and returns WebInteration object, which is similar to ViewInteraction.

perform() − Executes the action inside a web page using Atom and returns WebInteraction.

check() − This does the necessary assertion using WebAssertion.


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

