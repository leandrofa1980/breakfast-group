import { Option } from "./option";

export type Collaborator = {
    id: number;
    name: string;
    cpf: string;
    options: Option;
}

export type CollaboratorPage = {
    content?: Collaborator[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    first: boolean
    numberOfElements?: number;
    size?: number;
    number: number;
    empty?: boolean;
}