program #ex444
    int #im120 := 1;
    int #jc230 := 2;
    int #kf222 := 3;
    float #rp234 := 1.1;
    boolean #bb212 := true;
    int #ar111[2] := {1, 7};
    char #ch212[3..6] := {'c', 'd', '7'};

    ravie #fu555 (int #in111; boolean #wh121;) {
        int #mi111 := 2;
        int #cd232 := 3
        {
            agar ((#wh121, true)va angah) angah bazgasht
            (#cd232,#mi111)+;
            vagarna bazgasht (#cd232, #mi111)–;
        }
    };

    ravie #ab445 (int #in222;) {
        {
            agar (#in222, 0)> angah bazgasht #in222;
            vagarna bazgasht (-1, #in222)*;
        }
    }
main {
    #rp234 := (((2, #rp234)*),(3,#rp234)-),4)%;
    do {
        #im120 := #ab445((#im120, #kf222)-);
        exit when ((#ar111[2], 0)>)naghiz
        gozinesh i
            mored 0: {#im120:= ({#im120, 1)-}
            mored 1: {#kf222:= ({#kf222, 2)+}
            mored 2: {#im120:= ({#im120, 5)-}
            mored 3: {#im120:= ({#im120, 2)+}
            default: {#kf222:= 0}
        end
        #ar111[2] := (#ar111[2],(#ch212[2] = 'd'))-;
    } while (#kf222,0)>;
    for #jc230:= 10 downto 2 do {
        #im120 := (#im120, 1)+;
        #kf222:= (#kf222, 1)-;
    }
}