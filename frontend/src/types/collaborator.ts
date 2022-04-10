import { Option } from "./option";

export type Collaborator = {
    id: number;
    name: string;
    cpf: string;
    options: Option;
}