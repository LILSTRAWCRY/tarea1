
/**
 *
 * @author Jose Roberto Vargas Orellana)
 * @version 1
 */
public class Negromante
{
    int puntos_por_experiencia ;
    int nivel_de_inteligencia ;
    String habilidadEspecial ;
    int nivel_de_agilidad;
    int nivel_de_fuerza;
    int puntos_de_bonificacion;
    int nivel_de_personaje;
    short cantidad_de_mana;
    int cantidadDeReanimados;
    Negromante(int exp , int inteligencia , String habilidad,int agilidad , int fuerza , int bonificacion ,int nivel , short mana ,int reanimados){
        puntos_por_experiencia =exp;
        nivel_de_inteligencia= inteligencia ;
        habilidadEspecial =habilidad;
        nivel_de_agilidad= agilidad;
        nivel_de_fuerza=fuerza;
        puntos_de_bonificacion=bonificacion;
        nivel_de_personaje=nivel;
        cantidad_de_mana=mana;
        cantidadDeReanimados=reanimados;
    }

    String subirdenivel(int puntos_por_experiencia , int nivel_de_personaje){
        if(puntos_por_experiencia>100){
            nivel_de_personaje +=1;

        }else{

            return "Requisitos insuficientes para subir de nivel";
        }
    }

    String Aprendizaje( int nivel_de_inteligencia){
        if (nivel_de_inteligencia >100){
            return "ha aprendido una nueva habilidad";
        }else{

            return "Requisitos insuficientes para subir de nivel";
        }
    }