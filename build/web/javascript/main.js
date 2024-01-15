function like(postid, userid){  
    const d ={
        uid: userid,
        pid: postid,
        operation: "like"
    }
    $.ajax({
        url: "LikedServlet",
        data: d,
        success: function(data){
            let c = $(".like-button").html();
            if(data.trim()==="true"){
              c++;
            }
            else{   
                c--;               
            }
             $(".like-button").html(c);
        },
        error: function(data){
            console.log(data);
        }
    })
}