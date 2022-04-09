import axios from "axios";
import { useEffect, useState } from "react";
import { CollaboratorPage } from "types/collaborator";
import { BASE_URL } from "utils/requests";

const DataTable = () => {
  const [page, setPage] = useState<CollaboratorPage>({
    first: true,
    last: true,
    number: 0,
    totalElements: 0,
    totalPages: 0,
  });

  useEffect(() => {
    axios
      .get(
        `${BASE_URL}/collaborators?page=0&linesPerPage=3&direction=ASC&orderBy=name`
      )
      .then((response) => {
        setPage(response.data);
      });
  }, []);
  return (
    <div className="table-responsive">
      <table className="table table-striped table-sm">
        <thead>
          <tr>
            <th>Participante</th>
            <th>Opção</th>
          </tr>
        </thead>
        <tbody>
          {page.content?.map((item) => (
            <tr key = {item.id}>
              <td>{item.name}</td>
              <td>{item.options.breakfastChoice}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default DataTable;
