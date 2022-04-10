import { Collaborator } from "./collaborator"

export type Option =  {
    id: number,
    breakfastChoice: string,
    collaboratorDTO: Collaborator; 
}

export type OptionPage = {
    content?: Option[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;
}
