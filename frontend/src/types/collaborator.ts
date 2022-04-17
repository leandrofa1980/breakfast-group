export type Collaborator = {
  id: number;
  name: string;
  cpf: string;
  breakfastChoice: string;
};

export type CollaboratorPage = {
  content?: Collaborator[];
  last: boolean;
  totalPages: number;
  totalElements: number;
  size?: number;
  number: number;
  first: boolean;
  numberOfElements?: number;
  empty?: boolean;
};
