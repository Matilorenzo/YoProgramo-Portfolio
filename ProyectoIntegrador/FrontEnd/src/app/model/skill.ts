export class Skill {
    id: number;
    porcentaje: number;
    nombre: string;

    constructor(nombre:string, porcentaje: number){
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
}
