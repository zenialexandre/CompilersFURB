package interfaces.lexic;

public interface ParserConstants
{
    int START_SYMBOL = 47;

    int FIRST_NON_TERMINAL    = 47;
    int FIRST_SEMANTIC_ACTION = 81;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  3, -1, -1, -1, -1, -1,  3, -1,  3, -1, -1, -1, -1, -1,  3, -1, -1,  3,  3,  3, -1, -1,  1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  4, -1, -1, -1, -1, -1,  4, -1,  4, -1, -1, -1, -1, -1,  4, -1, -1,  4,  4,  4, -1, -1,  4,  4, -1, -1, -1, -1, -1, -1, -1, -1,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  8, -1, -1,  7, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  9, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 26, -1, -1, -1, -1, -1, 31, -1, 30, -1, -1, -1, -1, -1, 29, -1, -1, 28, 28, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 12, 13, -1, 12, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 18, -1, 16, -1, -1, -1, -1, 15, -1, -1, 14, -1, -1, -1, -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 19, 20, 21, 22, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 48, 48, 48, 48, 48, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, 48, 48, -1, -1, -1, -1, -1, 48 },
        { -1, 44, -1, -1, -1, -1, -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, -1, -1, 44, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 46, -1, -1, -1, -1, -1, 46, -1, 46, 45, 45, -1, -1, -1, 46, -1, -1, 46, 46, 46, -1, -1, -1, -1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 35, -1, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 38, 38, 38, 38, 38, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, 38, 38, -1, -1, -1, -1, -1, 38 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, 49, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, 51, -1 },
        { -1, 52, 52, 52, 52, 52, -1, -1, -1, -1, -1, -1, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, 52, 52, -1, -1, -1, -1, -1, 55 },
        { -1, 56, 56, 56, 56, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, 56, 56, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 57, 57, -1, 57, -1, -1, -1, 58, 58, 58, 58, -1, -1, -1, -1, -1, 57, 57, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 60, 61, 62, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 63, 63, 63, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, -1, 63, 63, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, 64, -1, 64, -1, -1, -1, 64, 64, 64, 64, 65, 66, -1, -1, -1, 64, 64, -1 },
        { -1, 67, 67, 67, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, 67, 67, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, 68, -1, 68, -1, -1, -1, 68, 68, 68, 68, 68, 68, 69, 70, 71, 68, 68, -1 },
        { -1, 72, 73, 74, 75, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 77, -1, -1, -1, -1, -1, -1, 78, 79, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 15, 18, 33, 48, 34 },
        { 50, 49 },
        { 53, 49 },
        { 54, 49 },
        { 48 },
        {  0 },
        { 24, 55, 51 },
        { 30, 58, 29 },
        { 27, 57, 52, 29 },
        {  0 },
        { 30, 58 },
        {  2, 56 },
        {  0 },
        { 28, 55 },
        { 17 },
        { 14 },
        {  9 },
        { 22 },
        {  7 },
        {  3 },
        {  4 },
        {  5 },
        {  6 },
        { 23 },
        { 13 },
        { 25, 55, 51 },
        { 62 },
        { 63 },
        { 65 },
        { 66 },
        { 68 },
        {  8, 29 },
        {  2, 30, 59, 29 },
        { 21, 32, 64 },
        {  6, 28, 55, 31, 29 },
        { 55, 31, 29 },
        { 19, 32, 69, 31, 29 },
        { 20, 32, 69, 31, 29 },
        { 59, 70 },
        {  0 },
        { 28, 69 },
        { 16, 32, 59, 31, 60, 67 },
        { 11, 60, 12, 29 },
        { 12, 29 },
        { 54, 61 },
        {  0 },
        { 60 },
        { 10, 60, 26, 32, 59, 31, 12, 29 },
        { 72, 71 },
        {  0 },
        { 44, 72, 71 },
        { 45, 72, 71 },
        { 73 },
        { 23 },
        { 13 },
        { 46, 72 },
        { 76, 74 },
        {  0 },
        { 75, 76 },
        { 35 },
        { 36 },
        { 37 },
        { 38 },
        { 78, 77 },
        {  0 },
        { 39, 78, 77 },
        { 40, 78, 77 },
        { 80, 79 },
        {  0 },
        { 41, 80, 79 },
        { 42, 80, 79 },
        { 43, 80, 79 },
        {  2 },
        {  3 },
        {  4 },
        {  5 },
        {  6 },
        { 32, 59, 31 },
        { 39, 80 },
        { 40, 80 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "esperado EOF", // $, fim do programa
        "esperado id",
        "esperado intw",
        "esperado flt",
        "esperado chr",
        "esperado str",
        "esperado boolean",
        "esperado break",
        "esperado char",
        "esperado do",
        "esperado else",
        "esperado end",
        "esperado false",
        "esperado float",
        "esperado fun",
        "esperado if",
        "esperado int",
        "esperado main",
        "esperado print",
        "esperado println",
        "esperado readln",
        "esperado string",
        "esperado true",
        "esperado val",
        "esperado var",
        "esperado while",
        "esperado \":\"",
        "esperado \",\"",
        "esperado \";\"",
        "esperado \"=\"",
        "esperado \")\"",
        "esperado \"(\"",
        "esperado \"{\"",
        "esperado \"}\"",
        "esperado \"==\"",
        "esperado \"!=\"",
        "esperado \"<\"",
        "esperado \">\"",
        "esperado \"+\"",
        "esperado \"-\"",
        "esperado \"*\"",
        "esperado \"/\"",
        "esperado \"%\"",
        "esperado \"&&\"",
        "esperado \"||\"",
        "esperado \"!\"",
        "esperado fun", //"<program> inv�lido",
        "<lst_instrucoes> inv�lido",
        "<lst_instrucoes_> inv�lido",
        "<decl_const> inv�lido",
        "<decl_constvar> inv�lido",
        "<decl_constvar_> inv�lido",
        "<decl_var> inv�lido",
        "<comando> inv�lido",
        "<lst_id> inv�lido",
        "<lst_id_> inv�lido",
        "<tipo> inv�lido",
        "<valor> inv�lido",
        "esperado expressao", //"<expressao> inv�lido",
        "<lst_comandos> inv�lido",
        "<lst_comandos_> inv�lido",
        "<cmd_atrib> inv�lido",
        "<cmd_input> inv�lido",
        "<cmd_input_> inv�lido",
        "<cmd_output> inv�lido",
        "<cmd_select> inv�lido",
        "<cmd_select_> inv�lido",
        "<cmd_loop> inv�lido",
        "esperado expressao", //"<lst_expressoes> inv�lido",
        "esperado expresaso", //"<lst_expressoes_> inv�lido",
        "esperado expressao", //"<expressao_> inv�lido",
        "esperado expressao", //"<elemento> inv�lido",
        "esperado expressao", //"<relacional> inv�lido",
        "esperado expressao", //"<relacional_> inv�lido",
        "<operador_relacional> inv�lido",
        "esperado expressao", //"<aritmetica> inv�lido",
        "esperado expressao", //"<aritmetica_> inv�lido",
        "esperado expressao", //"<termo> inv�lido",
        "esperado expressao", //"<termo_> inv�lido",
        "esperado expressao" //"<fator> inv�lido"
    };
}
