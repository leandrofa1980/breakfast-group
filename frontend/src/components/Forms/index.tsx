import { useState } from "react";

type FormData = {
  cpf: string;
  name: string;
  option: string;
};

export const Forms = () => {
  const [formData, setFormData] = useState<FormData>({
    cpf: "",
    name: "",
    option: ""
  });

  const handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
      const name = event.target.name;
      const value = event.target.value;

      setFormData({ ...formData, [name]:value})
  };

  const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    console.log(formData);
  };

  return (
    <div>
      <h2 className="text-primary">Cadastro</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-container">
          <input
            type="text"
            name="cpf"
            value={formData.cpf}
            placeholder=" Somente números"
            onChange={handleChange}
          />
          <br />
          <br />

          <input
            type="text"
            name="name"
            value={formData.name}
            placeholder="Nome completo "
            onChange={handleChange}
          />
          <br />
          <br />
          
          <input
            type="text"
            name="option"
            value={formData.option}
            placeholder="Informe sua escolha "
            onChange={handleChange}
          />
          <br />
          <br />

          <button type="submit">Cadastrar</button>
        </div>
      </form>
    </div>
  );
};
