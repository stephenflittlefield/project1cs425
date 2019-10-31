var Project1 = ( function() {

    return {

        init: function() {
            
            /* Output the current version of jQuery (for diagnostic purposes) */
            
            $('#output').html( "jQuery Version: " + $().jquery );
 
        },
        
        submitSessionSearch: function() {
            
            $.ajax({
                url: 'registration',
                method: 'GET',
                data: $('#searchform').serialize(),
                success: function(response) {
                    $('#output').html(response);                    
                }
            });
            
        },
        
        submitRegisterAttendee: function() {
            
            $.ajax({
                url: 'registration',
                method: 'POST',
                data: $('#registrationform').serialize(),
                dataType: "json",
                success: function(response) {
                    alert(JSON.stringify(response));                    
                }
            });
            
        }

    };

}());