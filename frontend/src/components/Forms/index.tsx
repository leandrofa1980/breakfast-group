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
    option: "",
  });

  const handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    const name = event.target.name;
    const value = event.target.value;

    setFormData({ ...formData, [name]: value });
  };

  const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    console.log(formData);
  };

  return (
    <div className="container col-sm-8">
      <h2 className="text-primary display-6 py-3">Cadastro</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-container">
          <div className="input-group input-group-md mb-3">
            <span className="input-group-text py-3" id="inputGroup-sizing-sm">
              CPF
            </span>
            <input
              type="text"
              className="form-control"
              aria-label="Sizing example input"
              aria-describedby="inputGroup-sizing-sm"
              value={formData.cpf}
              placeholder=" Somente números"
              onChange={handleChange}
            />
            <br />
            <br />
          </div>

          <div className="input-group input-group-md mb-3">
            <span className="input-group-text py-3" id="inputGroup-sizing-sm">
              Name
            </span>
            <input
              type="text"
              className="form-control"
              aria-label="Sizing example input"
              aria-describedby="inputGroup-sizing-sm"
              value={formData.cpf}
              placeholder=" Nome completo"
              onChange={handleChange}
            />
            <br />
            <br />
          </div>

          <div className="input-group input-group-md mb-3">
            <span className="input-group-text py-3" id="inputGroup-sizing-sm">
              Opção
            </span>
            <input
              type="text"
              className="form-control"
              aria-label="Sizing example input"
              aria-describedby="inputGroup-sizing-sm"
              value={formData.cpf}
              placeholder=" Informe sua escolha"
              onChange={handleChange}
            />
            <br />
            <br />
          </div>
          <div className="py-3">
            <button className="btn btn-dark" type="submit">
              Cadastrar
            </button>

            <br />
            <br />
          </div>
        </div>
      </form>
    </div>
  );
};
