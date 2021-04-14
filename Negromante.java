
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
    public Negromante(int exp , int inteligencia , String habilidad,int agilidad , int fuerza , int bonificacion ,int nivel , short mana ,int reanimados){
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

    // metodos 
    String subirdenivel(int puntos_por_experiencia , int nivel_de_personaje){
        if(puntos_por_experiencia>100){
            nivel_de_personaje +=1;

        }else{

            return "Requisitos insuficientes para subir de nivel";
        }
    }

    public String Aprendizaje( int nivel_de_inteligencia){
        if (nivel_de_inteligencia >100){
            return "ha aprendido una nueva habilidad";
        }else{

            return "Requisitos insuficientes para subir de nivel";
        }

        
        // getters y setters

        
  public int getPuntosPorexperiencia( ){
            return this.puntos_por_experiencia;
        }
    public void setPuntos_por_experiencia(int PuntosPorexperiencia ){
        this.puntos_por_experiencia= PuntosPorExperiencia;
    }

    public  int getNivel_de_inteligencia(){
        return this.nivel_de_inteligencia;
    } 

    public void setNivel_de_inteligencia(int niveldeintelig){
        this.nivel_de_inteligencia= niveldeintelig;

    }

    public String gethabilidadEspecial(){
        return this.habilidadEspecial;
    }

    public void sethabilidadEspecial(String habilidadespec){
        this.habilidadEspecial= habilidadespec;
    }

    public int getnivel_de_agilidad( ){
        return this.nivel_de_agilidad;
    }

    public void setnivel_de_agilidad(int nivel_de_agilidad ){
        this.nivel_de_agilidad= nivel_de_agilidad;
    }

    public int getnivel_de_fuerza( ){
        return this.nivel_de_fuerza;
    }

    public void setnivel_de_fuerza(int nivel_de_fuerza ){
        this.nivel_de_fuerza= nivel_de_fuerza;
    }

    public int getpuntos_de_bonificacion( ){
        return this.puntos_de_bonificacion;
    }    

    public void setpuntos_de_bonificacion(int puntos_de_bonificacion ){
        this.puntos_de_bonificacion= puntos_de_bonificacion;
    }

    public int getnivel_de_personaje( ){
        return this.nivel_de_personaje;
    }

    public void setnivel_de_personaje(int nivel_de_personaje ){
        this.nivel_de_personaje= nivel_de_personaje;
    }

    public int getcantidadDeReanimados( ){
        return this.cantidadDeReanimados;
    }

    public void setcantidadDeReanimados(int cantidadDeReanimados ){
        this.cantidadDeReanimados= cantidadDeReanimados;
    }

    public short getcantidad_de_mana( ){
        return this.cantidad_de_mana;
    }

    public void setcantidad_de_mana(short cantidad_de_mana ){
        this.cantidad_de_mana= cantidad_de_mana;
    }

}

  
