import { IArticle } from 'app/shared/model/article.model';

export interface ITag {
  id?: number;
  libelle?: string;
  articles?: IArticle[] | null;
}

export const defaultValue: Readonly<ITag> = {};
