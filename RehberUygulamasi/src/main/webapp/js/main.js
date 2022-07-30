function addNumber() {

    var rehber = new Object();
    rehber.ad = $('#name').val();
    rehber.soyad = $('#lastName').val();
    rehber.numara = $('#number').val();

    var rehberAsJson =  JSON.stringify(rehber)

    if (rehber.ad == "" || rehber.soyad == "" || rehber.numara == "") {
        alert("Tüm alanlar doldurulmalıdır");
    }else{

        $.ajax({
            type: "POST",
            url: "http://localhost:8080/insertnumara",
            data:rehberAsJson,
            success: function (response) {
                alert("Kayıt Başarılı")
                location.reload();
            }
        });
    }

}

function anaMenuyeYonlendir() {
    window.location =  "http://localhost:8080"
}


function tabloGoster() {

    $.ajax({
        type: "GET",
        url :  "http://localhost:8080/numaralistele",
        success: function (response) {

            var rehberList = JSON.parse(response);
            for (var sayac = 0; sayac < rehberList.length; sayac++) {
                
                var rehber = rehberList[sayac]
                $('#numbers')
                    .append(
                        "<tr><td>"+rehber.id +"</td>"+
                        "<td>"+rehber.ad +"</td>"+
                        "<td>"+rehber.soyad +"</td>"+
                        "<td>"+rehber.numara +"</td>" +
                        "<td><input type='button' value='Düzenle'></td>" +
                        "<td><input type='button' value='Sil' onclick='numaraSil("+ rehber.id+")'></td></tr>"
                    );
                
            }
            
        },
    });
}

function numaraSil(param) {
    $.ajax({
        type: "GET",
        url :  "http://localhost:8080/numarasil?id="+param,
        success: function (response) {
            location.reload();
        },
    });

}